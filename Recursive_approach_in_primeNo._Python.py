def PrimeNumber(n):
    def prime(n):
        if p%n==0:
            return n
        else:
            return prime(n-1)
    if prime(p-1)!=1:
        return False
    else:
        return True
p=int(input("Enter number : "))
if PrimeNumber(p):
    print("Prime")
else:
    print("Not Prime")

