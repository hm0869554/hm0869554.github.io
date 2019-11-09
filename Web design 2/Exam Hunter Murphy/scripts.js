var httpRequest = new XMLHttpRequest();
        httpRequest.open("get", "https://api.themoviedb.org/3/tv/popular?api_key=a566a820a44ecc9ad88867dda012db07&language=en-US&page=1");
        httpRequest.send(null);


        httpRequest.onreadystatechange = aFunction;
         function aFunction(){
            if(httpRequest.readyState == 4 && httpRequest.status == 200){
                var tvShows = httpRequest.responseText;
                var tvShowsJSON = JSON.parse(tvShows); 
                
                for(var i = 0; i < 6; i++)
                {
                    console.log(tvShowsJSON.results[i]);
                    var sec = document.createElement('SECTION');
                    var title = document.createElement('H1');
                    var desc = document.createElement('P');
                    var img = document.createElement('IMG');
                    var rating = document.createElement("H4")
                    var ratingHtml;
                    title.innerHTML = tvShowsJSON.results[i].original_name;
                    desc.innerHTML = tvShowsJSON.results[i].overview;
                    img.src = "http://image.tmdb.org/t/p/w300" + tvShowsJSON.results[i].poster_path;
                    rating.innerHTML =  "Average Rating: " + tvShowsJSON.results[i].vote_average;
                    console.log(rating);
                    sec.appendChild(title);
                    sec.appendChild(img);
                    sec.appendChild(desc);
                    sec.appendChild(rating);
                    
                    document.getElementById('popularShows').appendChild(sec)
                }
    }
    }