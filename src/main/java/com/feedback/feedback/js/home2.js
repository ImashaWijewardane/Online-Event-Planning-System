
//SCRIPT OF CHANGING IMAGE
let slideIndex = 0;
showSlides();

function showSlides() {
  let i;
  let slides = document.getElementsByClassName("mySlides");

  for (i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }

  slideIndex++;
  if (slideIndex > slides.length) { slideIndex = 1 }

  slides[slideIndex - 1].style.display = "block";
  setTimeout(showSlides, 3000); // Change image every 2 seconds

}

//SCRIPT OF ARTICLE VIEW
function loadData(name) {
  if (name == "btn1") {
    document.getElementById("para1").innerHTML = "COVID-19, also known as the coronavirus disease 2019, is a highly contagious respiratory illness caused by the novel coronavirus SARS-CoV-2. It originated in late 2019 in Wuhan, China, and rapidly spread worldwide, leading to a global pandemic. The virus primarily spreads through respiratory droplets, with symptoms ranging from mild, flu-like symptoms to severe respiratory distress, posing particular risks to vulnerable populations. To curb its transmission, public health measures like social distancing, mask-wearing, and vaccination campaigns have been implemented worldwide";
  }
  else if (name == "btn2") {
    document.getElementById("para2").innerHTML = "In 2023, cancer remains a complex and challenging global health issue, characterized by the uncontrolled growth of abnormal cells within the body. Despite significant advancements in research, diagnosis, and treatment, various forms of cancer continue to affect millions of lives worldwide. The year 2023 marks a pivotal moment in the ongoing battle against cancer, with ongoing efforts to improve early detection methods, enhance personalized therapies, and expand access to cutting-edge treatments.";
  }
  else if (name == "btn3") {
    document.getElementById("para3").innerHTML = "Nipah virus is a zoonotic virus that can cause severe respiratory and neurological infections in humans. It is primarily transmitted from fruit bats to humans, often via infected animals or contaminated fruits. Nipah virus outbreaks have been reported in several countries in South and Southeast Asia, leading to sporadic cases and occasional large-scale outbreaks. The virus can result in a range of symptoms, including fever, cough, encephalitis (inflammation of the brain), and even death, with no specific antiviral treatment available.";
  }

  else {
    alert("Invalid!!");
  }
}

//SCRIPT FOR RATING STAR
function rate(starCount) {
  const stars = document.querySelectorAll('.star');
  stars.forEach((star, index) => {
    if (index < starCount) {
      star.classList.add('clicked');
    } else {
      star.classList.remove('clicked');
    }
  });
}