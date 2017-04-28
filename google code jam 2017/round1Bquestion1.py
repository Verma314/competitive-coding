f2 = open("answer", "w")

with open("/home/verma314/GCG/A-large-practice.in") as f:
    content = f.readlines()
    length = len(content)
    i = 1
    idd = 1
    while ( i < length ):
        D, no = content[i].strip().split(' ')
        D = int(D)
        no = int(no)


        start_loc , min_speed = content[i+1].strip().split(' ')
        start_loc = int (start_loc)
        min_speed = int(min_speed)
	
        max_time = (D - start_loc )/ min_speed
       
        k = i + 1
        maxi = k + no
        #print ( "k", k, "maxi", maxi)
        while ( k < maxi ):
            #print ("hey")
            aa, bb =  content[k].strip().split(' ')
            aa = int(aa)
            bb = int(bb)
            time = (D - aa ) / bb
            max_time = max ( max_time, time)
            k = k +1

      
            
        answer = ( D / max_time)
        answer = '{0:.9f}'.format(answer)
        
        toPrint = "Case #" + str(idd)+": "+str(answer)+"\n"
        print ( toPrint )
        f2.write(toPrint)
        idd = idd + 1

        
        i = i + int(no) + 1  



f2.close()
