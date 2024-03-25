function dollartoinr()
{
	const dollar=document.getElementById("dollar").value;
	const indrs=(parseFloat(dollar)*82.90);
	document.getElementById("inr").value=indrs.toFixed(2);
}