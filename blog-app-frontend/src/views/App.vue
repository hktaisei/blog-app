<template>
  <div>
    <Header />
    <router-view />
  </div>
</template>

<script>
import Header from '../components/app/nav-header.vue';

export default {
  name: 'App',
  components: {
    Header
  }
}
</script>

<style>

</style>
