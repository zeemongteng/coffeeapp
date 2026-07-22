# Assignment: My First REST API — "Coffee Menu Service"

> **ชื่อ-นามสกุล:** นายพงศพัศ เลบ้านแท่น
> **รหัสนึกศักษา:** 673380283-6
> **section:** 1

---

## How to run : `mvn spring-boot:run`

---

## Curl example

**1. Get all**
curl http://localhost:8080/coffees

**2. Get by id**
curl http://localhost:8080/coffees/1

**3. Create**
curl -X POST http://localhost:8080/coffees \
     -H "Content-Type: application/json" \
     -d '{"name":"Cappuccino","price":60.0}'

**4. Update**
curl -X PUT http://localhost:8080/coffees/2 \
     -H "Content-Type: application/json" \
     -d '{"name":"Latte","price":50.0}'

**5. Delete**
curl -X DELETE http://localhost:8080/coffees/3

---

btw มีกาแฟอยู่ข้างในแล้ว 2 obj

public CoffeeService() {
        coffees.add(new Coffee(nextId++, "Espresso", 45.0));
        coffees.add(new Coffee(nextId++, "Latte", 55.0));
    }

---