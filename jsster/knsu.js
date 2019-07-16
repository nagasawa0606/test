function en(hnk, pai=3.14,){
	return(hnk*hnk*pai);
}

document.write(en(5)+"<br>");
document.write(en(7)+"<br>");
document.write(en(10)+"<br>");

document.write("<br><br><br>");

function uen(ad,ch){
	return (ad*500)+(ch*200)+"円です。";
}

document.write(uen(2,4));
document.write("<br>");
document.write(uen(1,5));
document.write("<br>");
document.write(uen(3,7));