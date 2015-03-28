
var negatif;

var sayi = prompt("sayi giriniz");
document.write(sayi);

var yazi=["bir","iki","uc","dort","bes","alti","yedi","sekiz","dokuz"];
document.write(yazi[1]);

if (sayi == 0)
    document.write("sayi 0 a esit");
else if (sayi > 0)
    document.write(yazi[sayi - 1]);
else if(sayi < 0) {
    negatif = -1 * (sayi);
    document.write(negatif);
    document.write(yazi[negatif-1]);
}