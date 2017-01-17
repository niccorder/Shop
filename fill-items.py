import requests
import random

baseUrl = "http://7216ccd7.ngrok.io/item"
itemNames = [
        ["Apple", 3.50, "A delicious fruit."],
        ["Cheese", 2.0, "Makes the world go round."],
        ["Liquor", 12.0, "I'd rather have a bottle infront of me..."],
        ["Pancakes", 1000, "The food of kings."],
        ["Soylent", 2.50, "A supplement bevarage."],
        ["Beets", .40, "You drop these."],
        ["Bears", 1020.03, "A big russian dog."],
]

def addItemsRandomly():
    for i in range(0, 50):
        randomItem = itemNames[random.randint(0, 6)]
        requests.post(baseUrl, data={ 
            'id':i, 
            'name':randomItem[0],
            'price':randomItem[1],
            'description':randomItem[2]
        })


addItemsRandomly()
