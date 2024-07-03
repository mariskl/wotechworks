filename = '/content/prices.txt'

with open(filename, 'r') as file:
    prices = file.readlines()

row_count = 0
sum = 0
for row in prices:
    row_count += 1
    sum += float(row)
    
print(row_count)
print(sum)
