const int LED_PIN = 13; 
const int BUTTON_PIN = 2; 
unsigned long prevMs = 0;
unsigned long millTime = 0;
byte ledState = HIGH;
byte buttonState;

void setup() {
  Serial.begin(9600);

  pinMode(LED_PIN, OUTPUT);
  pinMode(BUTTON_PIN, INPUT);
}

void loop() {

buttonState = digitalRead(BUTTON_PIN);
prevMs = millis();

  while(digitalRead(BUTTON_PIN)==0)
    {
      millTime = millis() - prevMs;
    }
    Serial.println(millTime);

if ((millTime <= 2000 ) && (millTime>0)){
  
      ledState = (ledState == HIGH) ? LOW: HIGH;
      digitalWrite(LED_PIN, ledState);
  }

if ((millTime > 2000 ) && (millTime>0)){
  
    digitalWrite(LED_PIN, LOW);
    ledState = LOW;
    delay(500);
    digitalWrite(LED_PIN, HIGH);
    ledState = HIGH;
  }
}