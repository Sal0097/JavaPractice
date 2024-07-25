class ShoeFactory {
    public static double order(String brand) {
        if(brand == "Nike") {
			price = 120.00;
			return;
		}
        if(brand=="Adidas"){
			price = 100.00;
            return;
		}
        if(brand=="Puma"){
			price = 80.00;
            return;
		}
		else{
			price = 60.00;
			return;
        }
        return price;
    }
}