from array import *
a=array('i',[])
n=int(input("Enter the size of the array : "))
for i in range (n):
    x=int(input())
    a.append(x)
print(a)
print("\nSelection sort is being executed")    
for i in range (n) :
    md=i
    for j in range (i+1,n):
        if(a[md]>a[j]):
            md=j
        a[i],a[md]=a[md],a[i]
print(a)