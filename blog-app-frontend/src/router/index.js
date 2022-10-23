import Vue from "vue";
import VueRouter from 'vue-router'
import HOME from '../views/home/home-index.vue';
import LIST from '../views/list/list-index.vue';

Vue.use(VueRouter);

export const routes = [{
    path: '/',
    name: 'home',
    component: HOME,
}, {
    path: '/list',
    name: 'list',
    component: LIST,
}, ];

const router = new VueRouter({
    mode: "history",
    base: process.env.BASE_URL,
    routes,
})

export default router