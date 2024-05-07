<template>
    <div>
        <p> {{ myMsg }}</p>
        ParentGrandChild: <ParentGrandChild :my-msg="myMsg"/>
    </div>

    <!-- $emit 사용 -->
    <!-- <button @click="$emit('someEvent')">emit 보내기</button> -->

    <!-- defineEmits 사용 -->
    <button @click="buttonClick">클릑</button>
</template>

<script setup>
import ParentGrandChild from '@/components/ParentGrandChild.vue'
    //1. 문자 배열
    //defineProps(['myMsg'])

    //2. 객체 (권장)
    const props = defineProps({
        myMsg: String,
    })

    //defineEmits
    const emit = defineEmits(['someEvent'])

    const buttonClick= () => {
        
    }

</script>
