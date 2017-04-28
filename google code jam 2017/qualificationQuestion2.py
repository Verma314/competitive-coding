def getString(stj,f):
    stj = [ str(k) for k in stj ]
    length = len(stj)
    counter = 0
    for i in range(0,length):
        if ( stj[i] == '-' and i+f <= length ):
            counter = counter + 1
            for j in range(i, i+f):
                if ( stj[j] == '-'):
                    stj[j] = '+'
                else:
                    stj[j] = '-'

    stj_set = set(stj)
    if ( stj_set == {'+'} ):
        return str(counter)
    else:
        return "IMPOSSIBLE"
                     
        
f2 = open("out-file-large", "w")
with open("/home/verma314/GCG/A-large.in") as f:
    content = f.readlines()[1::]
    i = 1
    for x in content:
        x,y = x.strip().split(' ')

        y = int(y)
        x = str(x)
        
        answer = getString(x,y)
        
        toPrint = "Case #" + str(i)+": "+str(answer)+"\n"
        i = i + 1
        f2.write(toPrint)
f2.close()
