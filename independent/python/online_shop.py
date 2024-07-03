class Client:

    def __init__(self, name):
        self.name = name
        self.transactions = []

    def add_transaction(self, transaction):
        self.transactions.append(transaction)

class Item:

    def __init__(self, product, price):
        self.product = product
        self.price = price

class Transaction:

    def __init__(self):
         self.items = []

    def add_item(self, item):
        self.items.append(item)
        return self

    def total_price(self):
        sum = 0
        for item in self.items:
            sum += item.price
        return sum
    
clients = []

clients.append(Client('Joosep'))
clients.append(Client('Britta'))
clients.append(Client('Vootele'))

items = []

items.append(Item('apples', 0.99))
items.append(Item('bananas', 0.79))
items.append(Item('cheese', 3.39))
items.append(Item('wine', 16.99))

clients[0].add_transaction(
    Transaction()
    .add_item(items[0])
    .add_item(items[1])
)
clients[0].add_transaction(
    Transaction()
    .add_item(items[3])
)

clients[1].add_transaction(
    Transaction()
    .add_item(items[2])
    .add_item(items[3])
)

clients[2].add_transaction(
    Transaction()
    .add_item(items[0])
    .add_item(items[2])
)

for client in clients:
    print(f'{client.name}: ')
    for transaction in client.transactions:
        print(' Transaction: ')
        for item in transaction.items:
            print(f'  {item.product} {item.price}')
        print(f' Total: {transaction.total_price()}')
