// ====================================================
// Codigo generado automaticamente desde Dangie (C3D)
// ====================================================

int modo;
int botonEncender;
int botonApagar;
int botonTodos;

void setup() {
  pinMode(13, OUTPUT);
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(4, INPUT);
  pinMode(3, INPUT);
  pinMode(2, INPUT);
  modo = 0;
}

void loop() {
  int t0 = digitalRead(4);
  botonEncender = t0;
  int t1 = digitalRead(2);
  botonTodos = t1;
  int t2 = digitalRead(3);
  botonApagar = t2;
  bool t3 = (botonEncender == HIGH);
  if (t3) {
  modo = 1;
  }
  bool t4 = (botonTodos == HIGH);
  if (t4) {
  modo = 2;
  }
  bool t5 = (botonApagar == HIGH);
  if (t5) {
  modo = 0;
  }
  bool t6 = (modo == 0);
  if (t6) {
  digitalWrite(13, LOW);
  digitalWrite(12, LOW);
  digitalWrite(11, LOW);
  }
  bool t7 = (modo == 2);
  if (t7) {
  digitalWrite(13, HIGH);
  digitalWrite(12, HIGH);
  digitalWrite(11, HIGH);
  }
  bool t8 = (modo == 1);
  if (t8) {
  digitalWrite(11, HIGH);
  digitalWrite(12, LOW);
  digitalWrite(13, LOW);
  delay(3000);
  digitalWrite(11, LOW);
  digitalWrite(12, HIGH);
  digitalWrite(13, LOW);
  delay(1000);
  digitalWrite(11, LOW);
  digitalWrite(12, LOW);
  digitalWrite(13, HIGH);
  delay(3000);
  }
}