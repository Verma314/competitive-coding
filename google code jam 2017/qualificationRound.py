def recurFit(ans):
    #ans = [ int(i) for i in str(n)]
    

    
    length = len(ans)
    for i in range(0,length-1):

        if ( ans[i+1] < ans[i] ) :

            #everything ahead that point is 9
            for j in range(i+1,length):
                ans[j] = 9

            #that point's value decreases by 1
            ans[i] = ans[i] - 1

            ans = recurFit(ans)

    if ( isSorted(ans) ):
        return ans




def isSorted(l):
    return (all(l[i] <= l[i+1] for i in range(len(l)-1)))


def combine(numList):
    s = ''.join(map(str, numList))
    return int(s)




f2 = open("out-file-LARGEEE", "w")
with open("/home/verma314/GCG/B-large.in") as f:
    content = f.readlines()[1::]
    i = 1
    for x in content:
        x = x.strip()
        #print( "for" ,x , end='')
        n_list = [ int(i) for i in str(x) ]

        #you have n_list now use recurFir(n_list) to get the descended value
        answer_list = recurFit(n_list)
        answer = combine(answer_list)
        toPrint = "Case #" + str(i)+": "+str(answer)+"\n"
        i = i + 1
        f2.write(toPrint)
f2.close()
        






    






    
