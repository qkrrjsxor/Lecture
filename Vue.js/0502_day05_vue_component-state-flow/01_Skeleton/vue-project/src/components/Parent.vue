<template>
    <div>
        <!-- ParentChild: <ParentChild my-msg="abc" /> -->

        ParentChild: <ParentChild @some-event="someCallback"/>
    </div>
</template>

<script setup>
    import ParentChild from '@/components/ParentChild.vue';
    const someCallback = function(){
        console.log('event')
    }
</script>
