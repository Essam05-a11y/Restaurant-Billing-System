# Restaurant Billing System

A console-based **Restaurant Billing and Order Management System** developed in **Java** using Object-Oriented Programming (OOP) principles, File I/O persistence, and custom sorting utilities.

## Features
- **Role-Based Access:** Separate workflows and permissions for **Admin** and **User** roles.
- **Menu & Inventory Management:** Add, update, and track available menu items and stock levels.
- **Order & Billing Processing:** Create customer orders, calculate totals, and generate itemized bills.
- **Data Persistence:** Save and load system records automatically using file handling (`FileManager`).
- **Sorting Utilities:** Organize menu items and records efficiently (`SortUtils`).

## Project Structure
~~~text
src/
├── Main.java          # Application entry point and CLI menu navigation
├── Admin.java         # Admin operations (menu & inventory management)
├── User.java          # Cashier/User operations (order creation & billing)
├── MenuItem.java      # Data model representing menu items
├── Inventory.java     # Stock and item availability management
├── Order.java         # Order processing and bill calculation logic
├── FileManager.java   # File I/O operations for persistent storage
└── SortUtils.java     # Custom sorting helper methods
~~~

## Technologies Used
- **Language:** Java
- **Concepts:** Object-Oriented Programming (OOP), File I/O, Collections, Sorting Algorithms