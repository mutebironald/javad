function isMadhavArray(arr){
    let isMadhav = 0;
    let k = 1;
    let temp;
    while(k < arr.length){
        temp = k*(k + 1)/2
        if(temp == arr.length){
            isMadhav = 1;
            break;
        }
        k++;
    }
    if(isMadhav == 0) return 0;
    let loop = 1;
    let i = 0;
    let inloop;
    while(i < arr.length){
        inloop = loop;
        temp = 0;
        while(inloop > 0){
            temp += arr[i++];
            inloop--;
        }

        if(temp != arr[0]) return 0;
        loop++;
    }
    return 1;
}

console.log(isMadhavArray([2,1,1]));
