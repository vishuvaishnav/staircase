import pickle
def createfile():
    r=[]
    while True:
        rn=int(input("enter"))
        n=input("enter name")
        c=int(input("enter class"))
        s=input("enter sec")
        d=[rn,n,c,s]
        r.append(d)
        ch=input("enter N for exit")
        if ch.upper()=='N':
            break
    f=open("student.dat",'wb')
    pickle.dump(r,f)
    f.close()
def count(c):
    f=open("student.dat",'rb')
    n=0
    r=pickle.load(f)
    for i in r:
        print(i)
        if i[2]==c:
            n+=1
    return n
createfile()
c=int(input("enter class to count"))
k=count(c)
print(k)
