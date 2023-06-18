public class pbl04 {
public static void main(String args[]) {
City curitiba = new City(2400, 400);
City guarapuava = new City( 200, 100);
City londrina = new City( 800, 300);
City maringa = new City( 600, 200);
City[] municipiosParana = {curitiba, guarapuava, londrina, maringa};
State parana = new State(municipiosParana);
City salvador = new City(3000, 400);
City juazeiro = new City( 400, 100);
City ilheus = new City(280, 200);
City itabuna = new City( 320, 300);
City[] municipiosBahia = {salvador, juazeiro, ilheus, itabuna};
State bahia = new State(municipiosBahia);
State[] estadosBrasil = {bahia, parana};
Country brasil = new Country(estadosBrasil);
System.out.println( curitiba.density() ); // quadro 1
System.out.println( parana.density() ); // quadro 3
System.out.println( bahia.area() ); // quadro 2
System.out.println( brasil.population() ); // quadro 4
System.out.println( brasil.density() ); // quadro 5
}
public static class Country {
private State[] estados;
public Country(State[] estados) {
this.estados = estados;
}
int population() {
int populationTotal = 0;
for (State estado : estados) {
populationTotal += estado.population();
}
return populationTotal;
}
double area() {
double areaTotal = 0;
for (State estado : estados) {
areaTotal += estado.area();
}
return areaTotal;
}
double density() {
return population() / area();
}
}
public static class State {
private City[] municipios;
public State(City[] municipios) {
this.municipios = municipios;
}
public int population() {
int populationTotal = 0;
for (City municipio : municipios) {
populationTotal += municipio.population();
}
return populationTotal;
}
public double area() {
double areaTotal = 0;
for (City municipio : municipios) {
areaTotal += municipio.area();
}
return areaTotal;
}
double density() {
return population() / area();
}
}
public static class City {
private int population;
private double area;
public City(int population, double area) {
this.population = population;
this.area = area;
}
public int population() {
return population;
}
public double area() {
return area;
}
public double density() {
return population/area;
}
}
}
