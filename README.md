# Java OOP Exercises

This repository contains **10 Object-Oriented Programming exercises implemented in Java**.  
Each exercise is organized in its own package and has its own `Main` class, so they can be executed independently.

The exercises practice core OOP concepts such as:

- Classes and objects
- Encapsulation
- Inheritance
- Abstract classes
- Polymorphism
- Method overloading
- `static` members
- `final` classes, attributes, and methods
- Composition
- Automatic code generation
- Business rules and validation

---

## Technologies

- **Java**
- **IntelliJ IDEA** recommended
- No external libraries required

---

## Project Structure

```text
src/
├── Questao01ClinicaVeterinaria/
├── Questao02PassagensRodoviaria/
├── Questao03CalculadoraTinta/
├── Questao04IngressosFestival/
├── Questao05LicenciamentoDetran/
├── Questao06ReservasHotel/
├── Questao07AlimentacaoZoologico/
├── Questao08LojaGames/
├── Questao09VoosAeroporto/
└── Questao10StreamingMusica/
```

Each package contains its own `Main.java`.  
To test an exercise, run the `Main` class inside the corresponding package.

---

## Question 1 — Veterinary Clinic

### Description

A veterinary clinic attends dogs and cats. Every animal has:

- Name
- Owner’s name
- Age
- Weight

Dogs also have a size:

- `P` — small
- `M` — medium
- `G` — large

Cats also have information about whether they are neutered.

### Rules

- The base consultation price is **R$ 120.00**.
- Large dogs (`G`) pay **25% more**.
- Neutered cats receive a **10% discount**.
- All other animals pay the base price.

### Concepts Used

- Inheritance
- Abstract class
- Code reuse
- Method overriding
- Polymorphism

### Expected Output

| Animal  | Type | Consultation Price |
|---------|------|--------------------|
| Thor    | Dog  | R$ 150.00          |
| Mel     | Dog  | R$ 120.00          |
| Luna    | Cat  | R$ 108.00          |
| Mingau  | Cat  | R$ 120.00          |

---

## Question 2 — Bus Tickets

### Description

A bus company sells tickets in three categories:

- Conventional
- Executive
- Sleeper (`Leito`)

Every ticket has:

- Origin
- Destination
- Seat number
- Base price

### Rules

- Conventional tickets cost the base price.
- Executive tickets cost the base price plus **35%**.
- Sleeper tickets cost the executive price plus **R$ 80.00**.
- If the executive pricing rule changes, the sleeper ticket must automatically follow the new rule.

### Concepts Used

- Inheritance
- Abstract class
- Method overriding
- `super` keyword
- Polymorphism

### Expected Output

| Category      | Final Price |
|---------------|-------------|
| Conventional  | R$ 150.00   |
| Executive     | R$ 202.50   |
| Sleeper       | R$ 282.50   |

---

## Question 3 — Paint Calculator

### Description

A paint store needs a system to calculate how many liters of paint a customer must buy.

By default:

- **1 liter** covers **10 m² per coat**.

Premium paints can have a different coverage value, informed when the calculator is created.

### Supported Calculations

The same method name, `calcularLitros`, is overloaded to support four situations:

1. Area in m² with one coat.
2. Wall width and height with one coat.
3. Wall width, height, and number of coats.
4. Wall width, height, number of coats, and the dimensions of an opening, such as a door.

### Concepts Used

- Constructor overloading
- Method overloading
- Default values
- Encapsulation

### Expected Output

| Situation                                        | Liters |
|--------------------------------------------------|--------|
| Area of 30 m²                                    | 3.0 L  |
| Wall of 4 m × 2.5 m                              | 1.0 L  |
| Wall of 4 m × 2.5 m with 2 coats                 | 2.0 L  |
| Wall of 5 m × 3 m, 2 coats, door of 0.8 m × 2.1 m | 2.664 L |
| Premium paint, wall of 4 m × 3 m, 2 coats        | 2.0 L  |

---

## Question 4 — Festival Tickets

### Description

A music festival sells tickets for two sectors:

- Pista — R$ 200.00
- Camarote — R$ 450.00

Every ticket has:

- Automatically generated code
- Buyer’s name
- Sector
- Price

### Rules

- Ticket codes are generated automatically in sequence: `1`, `2`, `3`, etc.
- The festival capacity is **5 tickets**.
- The capacity is shared by all tickets and cannot be changed during execution.
- It is possible to check:
  - Number of issued tickets
  - Total revenue
  - Remaining slots
- When capacity is reached, no new ticket can be issued.
- Trying to issue another ticket displays:

```text
Ingressos esgotados.
```

### Concepts Used

- `static` attributes
- `static` methods
- `final` constants
- Encapsulation
- Automatic ID generation
- Business validation

### Expected Output

Before any sale:

```text
0 ingressos emitidos
Total arrecadado: R$ 0,00
Vagas restantes: 5
```

After issuing 3 Pista tickets and 2 Camarote tickets:

```text
5 ingressos emitidos
Total arrecadado: R$ 1.500,00
Vagas restantes: 0
```

After trying to issue a sixth ticket:

```text
Ingressos esgotados.
```

---

## Question 5 — DETRAN Vehicle Licensing

### Description

The DETRAN needs a system to calculate the annual vehicle licensing fee for cars and motorcycles.

Every vehicle has:

- License plate
- Chassis number
- Owner’s name
- Market value

### Rules

- The license plate and chassis cannot be changed after registration.
- The owner can be changed in case of transfer.
- The licensing fee is **R$ 160.00**.
- Car IPVA is **3%** of the market value.
- Motorcycle IPVA is **2%** of the market value.
- Electric cars are exempt from IPVA.
- The total licensing value is always:

```text
licensing fee + IPVA
```

- No vehicle type can redefine the total licensing calculation.
- No specific motorcycle type can be created.

### Concepts Used

- `final` attributes
- `final` classes
- `final` methods
- Inheritance
- Abstract classes
- Encapsulation
- Composition of business rules

### Expected Output

| Vehicle       | IPVA        | Total Licensing |
|---------------|-------------|-----------------|
| Car           | R$ 2.400,00 | R$ 2.560,00     |
| Motorcycle    | R$ 300,00   | R$ 460,00       |
| Electric Car  | R$ 0,00     | R$ 160,00       |

The `Main` class also includes commented examples showing compilation errors for:

- Trying to change a vehicle’s plate.
- Trying to create a subclass of `Moto`.
- Trying to override the total licensing calculation.

---

## Question 6 — Hotel Reservations

### Description

A hotel has three types of rooms:

- Standard
- Luxo
- Suíte Presidencial

Every reservation records:

- Room number
- Guest name
- Number of nights

### Rules

- It must not be possible to create a generic room.
- Every room must be one of the three available types.
- Each room type calculates its total price differently:

| Room Type          | Price Rule                                             |
|--------------------|--------------------------------------------------------|
| Standard           | R$ 180.00 per night                                    |
| Luxo               | R$ 320.00 per night + R$ 40.00 breakfast per night     |
| Suíte Presidencial | R$ 700.00 per night, with 15% discount from 3 nights   |

- Every room displays a reservation summary.
- The summary logic is written only once in the abstract parent class.

### Concepts Used

- Abstract classes
- Inheritance
- Polymorphism
- Method overriding
- Code reuse

### Expected Output

| Room | Type               | Nights | Total Price |
|------|--------------------|--------|-------------|
| 101  | Standard           | 3      | R$ 540.00   |
| 202  | Luxo               | 2      | R$ 720.00   |
| 301  | Suíte Presidencial | 4      | R$ 2.380.00 |
| 302  | Suíte Presidencial | 2      | R$ 1.400.00 |

The `Main` class includes a commented example showing why it is impossible to instantiate an abstract `Quarto` directly.

---

## Question 7 — Zoo Feeding

### Description

A zoo needs to control the daily food consumption of its animals.

Every animal has:

- Name
- Weight in kg

The zoo has:

- Lions
- Elephants
- Penguins

### Rules

Daily food consumption depends on the species:

| Species   | Daily Food        |
|-----------|-------------------|
| Lion      | 5% of body weight |
| Elephant  | 3% of body weight |
| Penguin   | 10% of body weight |

- Food costs **R$ 12.00 per kg**.
- The price per kg is the same for every animal and cannot be changed during execution.
- The zoo can consult:
  - Number of registered animals
  - Total daily food consumption
  - Total daily feeding cost

### Concepts Used

- Abstract classes
- Inheritance
- Polymorphism
- `static` attributes
- `final` constants
- Encapsulation

### Expected Output

Before registration:

```text
Animais cadastrados: 0
Alimento diário total: 0.0 kg
Custo diário total: R$ 0,00
```

After registering the animals:

```text
Animais cadastrados: 3
Alimento diário total: 131.5 kg
Custo diário total: R$ 1.578,00
```

| Animal | Species  | Weight   | Daily Food |
|--------|----------|----------|------------|
| Zeca   | Lion     | 190 kg   | 9.5 kg     |
| Tonha  | Elephant | 4000 kg  | 120.0 kg   |
| Pipo   | Penguin  | 20 kg    | 2.0 kg     |

---

## Question 8 — Game Store

### Description

A game store sells physical and digital games.

Every game has:

- Title
- Base price

### Rules

- Physical games cost the base price plus **R$ 25.00** shipping.
- Digital games have no shipping cost.
- Shipping is charged only once per purchase and never receives a discount.

The same method name, `calcularPreco`, is overloaded to support:

1. Price of one unit.
2. Price with a discount percentage.
3. Price with a coupon.
4. Price for multiple units.

### Coupon Rule

- `GAMER10` gives **10% off**.
- Any other coupon gives no discount.

### Quantity Rule

- From **3 units**, there is a **5% discount** on the total price of the games.

### Concepts Used

- Inheritance
- Abstract classes
- Method overloading
- Polymorphism
- `toString()` overriding

### Expected Output

Physical game — “Aventura no Sertão”, base price R$ 200.00:

| Calculation              | Price      |
|--------------------------|------------|
| One unit                 | R$ 225.00  |
| 20% discount             | R$ 185.00  |
| Coupon `GAMER10`         | R$ 205.00  |
| 3 units                  | R$ 595.00  |

Digital game — “Corrida Estelar”, base price R$ 150.00:

| Calculation              | Price      |
|--------------------------|------------|
| One unit                 | R$ 150.00  |
| 20% discount             | R$ 120.00  |
| Invalid coupon           | R$ 150.00  |
| 2 units                  | R$ 300.00  |

---

## Question 9 — Airport Flights

### Description

An airline needs to control seat occupancy on its flights.

Every flight has:

- Automatically generated code
- Origin
- Destination
- Number of occupied seats
- Aircraft

Every aircraft has:

- Model
- Passenger capacity

### Rules

- The aircraft is created together with the flight.
- The aircraft exists only as part of the flight.
- The aircraft model and capacity cannot be changed.
- Flight codes follow the format:

```text
PNF-1
PNF-2
PNF-3
```

- The prefix `PNF` is fixed and cannot be changed.
- Seat reservations can be made in three ways:
  - One seat
  - A specific number of seats
  - A specific number of seats with a group reservation name
- A reservation cannot exceed the aircraft capacity.
- If there are not enough seats, no seat is reserved and the system displays:

```text
Assentos insuficientes.
```

- The airline can check the total number of passengers with reservations across all flights.

### Concepts Used

- Composition
- `final` attributes
- `static` attributes
- Automatic ID generation
- Method overloading
- Encapsulation
- Business validation

### Expected Output

Flight 1:

- Origin: Fortaleza
- Destination: Recife
- Aircraft: ATR 72
- Capacity: 70
- Occupied seats: 41

Flight 2:

- Origin: Fortaleza
- Destination: Natal
- Aircraft: A320
- Capacity: 180
- Occupied seats: 50
- Group reservation: Agência Sol

Total passengers across all flights:

```text
91
```

---

## Question 10 — Music Streaming

### Description

A music streaming platform offers three subscription plans:

- Individual
- Família
- Estudante

Every subscription has:

- Automatically generated code
- Subscriber name

### Rules

- It must not be possible to create a subscription without a defined plan.
- Codes are generated automatically in sequence: `1`, `2`, `3`, etc.
- The code and subscriber name cannot be changed.
- The base price is **R$ 21.90**.
- The base price is the same for all plans and cannot be changed during execution.

### Plan Pricing

| Plan       | Monthly Price                         |
|------------|----------------------------------------|
| Individual | R$ 21.90                               |
| Família    | Base price plus 60%                    |
| Estudante  | 50% of the base price                  |

- The `Estudante` plan cannot have subclasses.
- The subscription period can be calculated:
  - By number of months
  - By number of months and discount percentage
- Every subscription displays an invoice.
- The invoice format is defined only once and cannot be changed by subclasses.
- The platform can consult:
  - Number of created subscriptions
  - Total monthly revenue

### Concepts Used

- Abstract classes
- Inheritance
- `final` classes
- `final` methods
- `static` attributes
- Method overloading
- Encapsulation
- Automatic ID generation

### Expected Output

| Subscriber | Plan       | Monthly Price |
|------------|------------|---------------|
| Ana        | Individual | R$ 21.90      |
| Carlos     | Família    | R$ 35.04      |
| João       | Estudante  | R$ 10.95      |

Platform totals:

```text
Assinaturas criadas: 3
Receita mensal total: R$ 67,89
```

Period calculations:

| Subscription | Period                  | Value      |
|--------------|--------------------------|------------|
| Ana          | 6 months                 | R$ 131.40  |
| Carlos       | 12 months                | R$ 420.48  |
| Carlos       | 12 months with 10% off   | R$ 378.43  |

---

## How to Run

1. Clone the repository:

```bash
git clone [https://github.com/your-username/your-repository-name.git](https://github.com/your-username/your-repository-name.git)
```

2. Open the project in IntelliJ IDEA.

3. Navigate to the desired exercise package.

4. Open its `Main.java`.

5. Run the `main` method.

Example:

```text
src/Questao01ClinicaVeterinaria/Main.java
```

---

## Author

**Tuctu**  
Computer Science student and software builder.  
Interested in Java, software engineering, cloud, AI, DevOps, and cybersecurity.
