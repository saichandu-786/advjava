/*let massRatan=parseInt(prompt("Enter mass of Ratan"))
let massAnu=parseInt(prompt("Enter mass of Anu"))
let heightRatan=parseFloat(prompt("Enter height of Ratan"))
let heightAnu=parseFloat(prompt("ENter height of Anu"))
var BMIRatan,BMIAnu;
BMIRatan=massRatan/(heightRatan*heightRatan)
BMIAnu=massAnu/(heightAnu*heightAnu)
console.log(`BMI of Ratan is ${BMIRatan}`)
console.log(`BMI of Anu is ${BMIAnu}`)
document.write(`BMI of Ratan is ${BMIRatan}<br>`)
document.write(`BMI of Anu is ${BMIAnu}<br>`)
var RatanHigherBMI;
RatanHigherBMI=BMIRatan>BMIAnu;
if(RatanHigherBMI){
	console.log(`BMI of Ratan is heigher than BMI of Anu`)
	document.writeln(`BMI of Ratan is heigher than BMI of Anu<br>`)
}
else
{
	console.log(`BMI of Ratan is less than BMI of Anu`)
	document.write(`BMI of Ratan is less than BMI of Anu<br>`)
}


for(let i=1;i<=100;i++)
{
	if(i%3==0 && i%5==0)
		document.write("FizzBuzz<br>")
	else if(i%3==0)
		document.write("Fizz<br>")
	else if(i%5==0)
		document.write("Buzz<br>")
	else
		document.write(i+"<br>")
		}*/



function cutFruitPieces(fruit)
{
	return fruit*4;
}
function fruitProcessor(apple,orange)
{
	var appslices=cutFruitPieces(apple);
	var orgslices=cutFruitPieces(orange);
	
	return "juice preparing with"+appslices+"applepieces &"+orgslices+"orangepieces"; 
}
var res=fruitProcessor(8,6);
document.write(res);

function fruitprocessor(apples,orange)
{
	return "juice preparing with"+apples+"apples &"+orange+"oranges";
}
let re=fruitprocessor(8,6);
document.write(re);

function average(a,b,c)
{
	return (a+b+c)/3;
}
var dolphins=average(96,108,89);
var kaalas=average(88,91,110);
if(dolphins>=100 && kaalas>=100)
{
if(dolphins>kaalas)
	document.write("Dolphins win");
else if(kaalas===dolphins)
	document.write("their average scroce are equal");
else
	document.write("kaalas win");
}
else
	document.write("both team average is not greater than 100")









