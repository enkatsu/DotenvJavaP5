# DotenvP5 

DotenvP5 is a library for Processing that loads environment variables from `.env` files.
This is based on [java-dotenv](https://github.com/cdimascio/dotenv-java).

[JavaDoc](https://enkatsu.github.io/DotenvP5/javadoc)

## Usage

### `.env`

```env
HELLO=DOTENVP5
```

### Processing sketch

```pde
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
```

## License

MIT License
