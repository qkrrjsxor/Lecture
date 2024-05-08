import { ref, computed } from 'vue'
import { defineStore } from 'pinia'
import axios from 'axios'

export const useYoutubeStore = defineStore('counter', () => {

  const videos = ref([])
  const selectedVideo = ref(null) 

  const youtubeSearch = function (keyword) {
    // console.log(keyword)
    const URL ='https://www.googleapis.com/youtube/v3/search'
    const API_KEY = 'AIzaSyAdM-otrxV9EbdnOFQMz0-LGOOGxvg_1vw'

    axios({
      url: URL,
      method: 'GET',
      params: {
        key: API_KEY,
        part: 'snippet',
        maxResult: 10,
        q: keyword,
        type: 'video'
      }
    })
    .then((response) => {
      videos.value = response.data.items
      console.log(response.data)
    })
    .catch(() =>{})
  }

  const clickVideo = function(video){
    selectedVideo.value = video
  }

  return { youtubeSearch, videos, selectedVideo, clickVideo}
})
