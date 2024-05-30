balance = 0
pin_code = '1234'
tries = 0
access_granted = False

while True:
    pin_code_input = input('Please enter your pin code: ')

    if pin_code_input == pin_code:
        print('Welcome to the bank!')
        access_granted = True
        break

    else:
        tries = tries + 1

        if tries == 3:
            print('Your account is blocked.')
            break
        else:
             print('Wrong pin, try again!')

while access_granted:

    bank = input('What would you like to do? (deposit, withdrawal, balance, stop): ')

    if bank == 'stop':
        print('You have exited the bank')
        break

    if bank == 'deposit':
        deposit = float(input('Please enter the amount you want to deposit: '))
        balance = balance + float(deposit)
        continue
    
    if bank == 'withdrawal':
        withdrawal = float(input('Please enter the amount you wish to withdraw: '))

        if withdrawal > balance:
            print('You do not have enough funds.')
            continue
        balance = balance - float(withdrawal)
        continue

    if bank == 'balance':
        print(f'Your balance is {balance}')
        continue

    print('Invalid choice, please try again')
        
        
