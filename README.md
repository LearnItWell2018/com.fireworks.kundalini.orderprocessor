# com.fireworks.kundalini.orderprocessor
  
<h1>POST</h1>

http://localhost:8080/orderprocessor/rs/order

<h3>Request JSON</h3>

<p>
{ 
	"customerDetails" :{
		"customerMail" : "suparnog13@gmail.com", 
		"customerMobile" : "9163848888" ,
		"customerAddress" : {
			"pincode" : "700121",
			"street" : "AJC Bose road",
			"roomorflatno" : "82",
			"nearestLandMark" : "Jagriti Shangha Club"		
		}
	}, 
	"orderDetails" : {
	"orderDate" : "13/12/2017 IST 14:20", 
	"orderList": 
	[
				{
					"productId": "POTS-001",
					"itemCount": "10"
				},
				{
					"productId": "POTS-001",
					"itemCount": "10"
				},
				{
					"productId": "POTS-001",
					"itemCount": "10"
				},
				{
					"productId": "POTS-001",
					"itemCount": "10"
				}
	]
	}
}
</p>

<h3>Response JSON | 200 </h3>

<p>
{
    "orderId": "5a9a1bc4d025d91f9c3ef75d",
    "customerDetails": {
        "customerMail": "suparnog13@gmail.com",
        "customerMobile": "9163848888",
        "customerAddress": {
            "pincode": "700121",
            "street": "AJC Bose road",
            "roomorflatno": "82",
            "nearestLandMark": "Jagriti Shangha Club"
        }
    },
    "orderDetails": {
        "orderDate": "13/12/2017 IST 14:20",
        "orderList": [
            {
                "productId": "POTS-001",
                "itemCount": "10"
            },
            {
                "productId": "POTS-001",
                "itemCount": "10"
            },
            {
                "productId": "POTS-001",
                "itemCount": "10"
            },
            {
                "productId": "POTS-001",
                "itemCount": "10"
            }
        ]
    }
}
</p>


<h1>GET</h1>

http://localhost:8080/orderprocessor/rs/order/5a9a1bc4d025d91f9c3ef75d

<h3>Response JSON | 200 </h3>

<p>
{
    "orderId": "5a9a1bc4d025d91f9c3ef75d",
    "customerDetails": {
        "customerMail": "suparnog13@gmail.com",
        "customerMobile": "9163848888",
        "customerAddress": {
            "pincode": "700121",
            "street": "AJC Bose road",
            "roomorflatno": "82",
            "nearestLandMark": "Jagriti Shangha Club"
        }
    },
    "orderDetails": {
        "orderDate": "13/12/2017 IST 14:20",
        "orderList": [
            {
                "productId": "POTS-001",
                "itemCount": "10"
            },
            {
                "productId": "POTS-001",
                "itemCount": "10"
            },
            {
                "productId": "POTS-001",
                "itemCount": "10"
            },
            {
                "productId": "POTS-001",
                "itemCount": "10"
            }
        ]
    }
}
</p>
