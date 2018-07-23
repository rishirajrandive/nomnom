[![codecov](https://codecov.io/gh/rishirajrandive/nomnom/branch/master/graph/badge.svg)](https://codecov.io/gh/rishirajrandive/nomnom)

# nomnom
Easy to use app to find restaurants

**Setup**

1. This project is developed using Android Studio 3.0 Beta 6, it is recommended to use same.
2. Clone the repo in your local and then open in Android Studio
3. Or you can use Android Studio to checkout the project from Github.
4. Android studio should be able to build the project successfully.
5. Connect your mobile and run. (Running on Emulator may give some issues)


**External libraries used**

1. Dagger 2 - For dependency injection
2. Picasso - For image loading
3. RxJava - Async calls
4. Gson - For easy JSON response parsing
5. Retrofit - To make network calls

**About project**
1. Project uses Android Architecture Components except no data is persisted in Room
2. Google Maps API is used to show the map and the markers on it
3. Google Places API is used to fetch restaurants (right now few of the search params are hard coded, such as,
radius=500, type=restaurant, location=San Fransisco)
3. Also, the project only loads first 20 restaurants, need more work to implement paging logic


**Screen shots of app**

* Map view

<img height="300" src="https://raw.githubusercontent.com/rishirajrandive/nomnom/master/screenshots/map.png" alt="Map"/>

* List view

<img height="300" src="https://raw.githubusercontent.com/rishirajrandive/nomnom/master/screenshots/list.png" alt="List"/>

* Detail view

<img height="300" src="https://raw.githubusercontent.com/rishirajrandive/nomnom/master/screenshots/detail1.png" alt="detail"/>

* Reviews on detail view

<img height="300" src="https://raw.githubusercontent.com/rishirajrandive/nomnom/master/screenshots/detail2.png" alt="detail1"/>


