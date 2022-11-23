public class car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    car (String brand,String model, int productionYear, String productionCountry, String color, double engineVolume) {
            this.brand = brand;
            this.model=model;
            this.engineVolume = engineVolume;
            this.color = color;
            this.productionYear = productionYear;
            this.productionCountry = productionCountry;
        }
        @Override
        public String toString() {
            return "Автомобиль " + this.brand + " "+ this.model +", "+
                    this.productionYear+" года выпуска, сборка - "+this.productionCountry+
                    ", цвет - "+this.color+", объем двигателя — "+this.engineVolume;
            }
        }