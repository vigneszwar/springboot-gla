import requests

def call_flights_api():
    flight = {
        "name": "SpiceJet",
        "src": "Mumbai Airport",
        "dest": "Delhi Airport",
        "departure": "7:00 pm",
        "arrival": "10:00 pm"
    }
    response = requests.post("http://localhost:8080/flights", json = flight)
    print(response.status_code)
    print(response.text)

call_products_api()

#     product = {
#         'name': 'Redmi note 12',
#         'price': 1000.99
#     }
#     # response = requests.post("http://localhost:5000/products", json = product)
#     # print(response.status_code)
#     # print(response.text)

#     response = requests.put("http://localhost:5000/products/2", json=product)
#     print(response.status_code)
#     print(response.text)


#     response = requests.get("http://localhost:5000/products")
#     print(response.status_code)
#     print(response.text)

#     response = requests.delete("http://localhost:5000/products/2")
#     print(response.status_code)
#     print(response.text)



#     response = requests.get("http://localhost:5000/products")
#     print(response.status_code)
#     print(response.text)

# if __name__ == "__main__":
#     call_products_api()