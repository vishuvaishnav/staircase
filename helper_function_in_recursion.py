def collect_odds(arr):
    result=[]
    def helper_func(ar,l):
        if len(ar)==0:
            return 
        if ar[0]%2!=0:
            result.append(ar[0])
        c=(l+1)-len(arr)
        return helper_func(ar[c:],l)
    helper_func(arr,len(arr))
    return result
#print(collect_odds([1,2,3,4,5,6,7,8,9]))
