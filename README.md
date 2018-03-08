<div style="background-color: green">GET</div> : http://localhost:8080/kundalini/rs/itemCategories/
{ "items" : 
	[ 
		{"itemName" : "POTS"}, {"itemName" : "BOMBS"}, {"itemName" : "CHARKAS"}
	]
}

GET : http://localhost:8080/kundalini/rs/items/
		
{ 	"itemVersion" : "1",
	"itemStatus" : "active",
	"items" : {
	"itemCreator" : "Suparna Ghosh",
	"itemList" :[ 
		 	{ "itemName" : "POTS", "itemTypeList": 
				[
					{
						"productId" : "POTS-001",
						"productImgPath" : "/img/img.jpg",
						"brand" : "SIVKASHI",
						"itemName": "Red POTS",
						"itemPrice": "sds",
						"itemStock": "sds",
						"itemActive": "true"
					},
					{
						"productId" : "POTS-002",
						"productImgPath" : "/img/img.jpg",
						"brand" : "SIVKASHI",
						"itemName": "Red POTS",
						"itemPrice": "sds",
						"itemStock": "sds",
						"itemActive": "true"
					},
					{
						"productId" : "POTS-003",
						"productImgPath" : "/img/img.jpg",
						"brand" : "SIVKASHI",
						"itemName": "Red POTS",
						"itemPrice": "sds",
						"itemStock": "sds",
						"itemActive": "true"
					},
					{
						"productId" : "POTS-004",
						"productImgPath" : "/img/img.jpg",
						"brand" : "SIVKASHI",
						"itemName": "Red POTS",
						"itemPrice": "sds",
						"itemStock": "sds",
						"itemActive": "true"
					}
				]
			},
			{ "itemName" : "BOMBS", "itemTypeList": 
				[
					{
						"productId" : "BOMBS-001",
						"productImgPath" : "/img/img.jpg",
						"brand" : "SIVKASHI",
						"itemName": "Red BOMBS",
						"itemPrice": "sds",
						"itemStock": "sds",
						"itemActive": "true"
					},
					{
						"productId" : "BOMBS-002",
						"productImgPath" : "/img/img.jpg",
						"brand" : "SIVKASHI",
						"itemName": "Red BOMBS",
						"itemPrice": "sds",
						"itemStock": "sds",
						"itemActive": "true"
					},
					{
						"productId" : "BOMBS-003",
						"productImgPath" : "/img/img.jpg",
						"brand" : "SIVKASHI",
						"itemName": "Red BOMBS",
						"itemPrice": "sds",
						"itemStock": "sds",
						"itemActive": "true"
					},
					{
						"productId" : "BOMBS-004",
						"productImgPath" : "/img/img.jpg",
						"brand" : "SIVKASHI",
						"itemName": "Red BOMBS",
						"itemPrice": "sds",
						"itemStock": "sds",
						"itemActive": "true"
					}
				]
			}
		]
	}
}

GET : http://localhost:8080/kundalini/rs/items/POTS/
		
{ "itemTypeList": 
	[
		{
			"productId" : "POTS-001",
			"productImgPath" : "/img/img.jpg",
			"brand" : "SIVKASHI",
			"itemName": "Red POTS",
			"itemPrice": "sds",
			"itemStock": "sds",
			"itemActive": "true"
		},
		{
			"productId" : "POTS-002",
			"productImgPath" : "/img/img.jpg",
			"brand" : "SIVKASHI",
			"itemName": "Red POTS",
			"itemPrice": "sds",
			"itemStock": "sds",
			"itemActive": "true"
		},
		{
			"productId" : "POTS-003",
			"productImgPath" : "/img/img.jpg",
			"brand" : "SIVKASHI",
			"itemName": "Red POTS",
			"itemPrice": "sds",
			"itemStock": "sds",
			"itemActive": "true"
		},
		{
			"productId" : "POTS-004",
			"productImgPath" : "/img/img.jpg",
			"brand" : "SIVKASHI",
			"itemName": "Red POTS",
			"itemPrice": "sds",
			"itemStock": "sds",
			"itemActive": "true"
		}
	]
}

GET : http://localhost:8080/kundalini/rs/items/POTS/POTS-001

{
	"productId" : "POTS-001",
	"productImgPath" : "/img/img.jpg",
	"brand" : "SIVKASHI",
	"itemName": "Red POTS",
	"itemPrice": "sds",
	"itemStock": "sds",
	"itemActive": "true"
}

POST : http://localhost:8080/kundalini/rs/customer/

{
  "customerMail": "suparnog13@gmail.com",
  "customerMobile": "9163848888",
  "customerDetails": 
  {
	"customerDOB" : "13/12/1988",
	"customerAddress": 
	[ 
		{
		  "id" : 1,
		  "pincode": "700121",
		  "street": "AJC Bose road",
		  "roomorflatno": "82",
		  "nearestLandMark": "Jagriti Shangha Club"
		} ,
		{
		  "id" : 2,
		  "pincode": "700121",
		  "street": "AJC Bose road",
		  "roomorflatno": "82",
		  "nearestLandMark": "Jagriti Shangha Club"
		}
	]
  }
}

POST : http://localhost:8080/kundalini/rs/order/
{
  "customerMail": "suparnog13@gmail.com",
  "customerMobile": "9163848888",
  "orderDetails": {
	"orderTotal": "1200.00",
	"orderTAXAmount": "100.00",
	"deliveryCharges": "100.00",
    "orderDate": "13/12/2017 IST 14:20",
	"deliveryAddressID": 1,
	"deliveryDate": "13/12/2019 IST 14:20",
    "orderList": [
      {
        "productId": "POTS-001",
        "itemCount": "10",
		"itemPrice": "10.00"
      },
      {
        "productId": "POTS-001",
        "itemCount": "10",
		"itemPrice": "10.00"
      },
      {
        "productId": "POTS-001",
        "itemCount": "10",
		"itemPrice": "10.00"
      },
      {
        "productId": "POTS-001",
        "itemCount": "10",
		"itemPrice": "10.00"
      }
    ]
  }
}
