var aryMovies = ["Matrix", "Mulan", "Don't Ask Me"]

Vue.component('sectionlist',{
    props:["themovies"],
    template:
    `
        <section>
            <h1><slot></slot></h1>
            <img v-bind:src = "imgsrc">
            <list-item v-for = "movie in themovies">{{movie}}</list-item>
        
        </section>
    `,
    data: function()
    {
        return{
            imgsrc : "mushu.png"
        }
    }
})

Vue.component("list-item", {
    template:`
    <p><slot></slot></p>
    `
})



new Vue({
    el: "#app",
    data:
    {
        mess: "Alo Lume",
        movies: aryMovies,
        aryTvShows: ['Sirens', 'New Amsterdam', 'Fresh Prince of Bel-air']
    }
})