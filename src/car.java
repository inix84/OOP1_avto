public class car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    car (String brand,String model, int productionYear, String productionCountry, String color, double engineVolume) {
        if (brand!=null && brand.length()!=0) {
            this.brand = brand;
        } else {
            this.brand = "default";
        }
        if (model!=null && model.length()!=0) {
            this.model=model;
        } else {
            this.model = "default";
        }
        if (engineVolume>0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = 1.5;
        }
        if (color!=null && color.length()!=0) {
            this.color = color;
        } else {
            this.color = "белый";
        }
        if (productionCountry!=null && productionCountry.length()!=0) {
            this.productionCountry = productionCountry;
        } else {
            this.productionCountry = "default";
        }
        if (productionYear>0) {
            this.productionYear = productionYear;
        } else {
            this.productionYear =2000 ;
        }
    }
    @Override
        public String toString() {
            return "Автомобиль " + this.brand + " "+ this.model +", "+
                    this.productionYear+" года выпуска, сборка - "+this.productionCountry+
                    ", цвет - "+this.color+", объем двигателя — "+this.engineVolume;
            }
        }