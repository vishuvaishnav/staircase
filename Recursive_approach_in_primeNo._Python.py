def prime(n):
    if p%n==0:
        return n
    else:
        return prime(n-1)
p=int(input("Enter number : "))
if prime(p-1)!=1:
    print("Not prime")
else:
    print("Prime")
