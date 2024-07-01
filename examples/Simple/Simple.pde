import org.enkatsu.dotenvp5.*;

DotenvP5 dotenv;

void setup() {
  size(600, 600);
  dotenv = new DotenvP5(this);
  
  print("HELLO=");
  println(dotenv.get("HELLO"));
  
  print("DEFAULT_TEST=");
  println(dotenv.get("DEFAULT_TEST", "default"));
  
  println("*** All environment variables ***");
  println(dotenv);
}

void draw() {
}
