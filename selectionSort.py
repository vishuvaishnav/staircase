def selectionSort(arr):
    for i in range(len(arr)):
        lowest=i
        for j in range(i+1,len(arr)):
            if arr[j]<arr[lowest]:
                lowest=j
        arr[i],arr[lowest]=arr[lowest],arr[i]
    return arr

arr = list(map(int,input("Enter : ").split()))
print(selectionSort(arr))
