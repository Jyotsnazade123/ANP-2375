//header scroll
let nav=document.querySelector(".navbar");
window.onscroll = function () {
    if(document.documentElement.scrollTop >20){
        nav.classList.add('header-scrolled');
    }else{
        NaN.classList.remove('header-scrolled');
    }
}

// nav hide
let navbar = document.querySelectorAll(".nav-click");
let navCollapse = document.querySelector(".navbar-collapse.collapse");
navbar.forEach(function(a){
    a.addEventListener("click",function(){
        navCollapse.classList.remove("show");
    })
})