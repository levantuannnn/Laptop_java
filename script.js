    let slider=document.querySelector('.slider');
    let slider_img=document.querySelector('.slider__img');
    let list__img=document.querySelectorAll(' .slider__img img');
    let cnt=0;
    let leng=list__img.length;
    setInterval(()=>{
        
        if(cnt>=leng-3){
        let img=list__img[0].offsetWidth;
        console.log(img);
        slider_img.style.transform=`translateX(0px)`;
        cnt=0;
            
        }
        else {
            ++cnt;
            let img=list__img[0].offsetWidth;
            console.log(img);
            slider_img.style.transform=`translateX(${img *cnt*-1}px)`;
        }
        
    },3000);
    let prev = document.querySelector(".prev");
    let next = document.querySelector(".next");
    let slider__lap = document.querySelector(".create__element");
    let img = document.querySelectorAll(".create__element__way");
    let dem = 0;
    let leng__lap = img.length;
    
    prev.onclick = function () {
        if (dem -1> 0) {
            dem--;  
        } else {
            dem = leng__lap - 1; 
        }
        reload();
    };
    
    next.onclick = function () {
        if (dem+1 < leng__lap - 3) {
            dem++;  
        } else {
            dem = 0; 
        }
        reload();
    };
    function reload() {
        let width = img[0].clientWidth; 
        slider__lap.style.transform = `translateX(-${dem * width}px)`;
    } 
    let res = setInterval(() => {
        next.click();
    }, 3000);
    
    function gio(){
        let now=new Date();
        let gio=String(now.getHours()).padStart(2, "0");
        let phut=String(now.getMinutes()).padStart(2, "0");
        let giay=String(now.getSeconds()).padStart(2, "0");
        let timout=`${gio}:${phut}:${giay}`;
        document.querySelector(".create__gio").innerHTML=timout;
    }
    setInterval(gio, 1000);
  