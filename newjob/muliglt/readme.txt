1.architecture applies springboot instead of springcloud for simplicity.
2.Watch class has method getSubTotalPrice is to calculate the total price for that specific type e.g(Rolex) considering discount. Also Incr methond in Watch class is to get the count num for every different type.
3.WatchServiceImpl has two method.initWatchList method is to initial the data instead of getting the data from database. The other method called calculatePrice is to sum all the watches price together
4.URL input like http://localhost:8080/mulight/watch/calculateprice?watchlists=003,001,001,002,004,002,002 will return 
{"resultCode":200,"errMsg":"","body":{"totalprice":513.0}}
