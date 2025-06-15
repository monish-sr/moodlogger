# MoodLogger – A Personal Mood Tracking System
MoodLogger is a Java-based command-line application that allows users to log their daily moods, review past entries, and save their data to a text file. It emphasizes mental wellness by providing a simple interface for journaling emotions.

## Project Overview
MoodLogger is a Java-based command-line application that enables users to log their daily moods, review previous entries, and save their emotional records to a text file. Designed with simplicity and mental wellness in mind, the app provides a user-friendly menu-driven interface for emotional journaling. Each entry is timestamped using Java’s Date-Time API, stored dynamically with ArrayList, and written to file using File I/O operations. Built using object-oriented principles, MoodLogger serves as a personal reflection tool while showcasing foundational Java programming skills like class design, input handling, and persistent storage.

## Methdologies
The methodology for the MoodLogger project involves designing a user-interactive, menu-driven command-line interface using Java. It follows object-oriented principles to encapsulate mood entry data such as timestamp and user notes. The system utilizes ArrayList for dynamic storage of multiple mood logs during runtime. Each entry is time-stamped using Java's LocalDateTime and formatted with DateTimeFormatter for readability. User input is handled using the Scanner class, and entries can be saved persistently to a .txt file through FileWriter. This approach ensures modular code design, efficient in-memory data handling, and long-term storage for personal emotional tracking.

1. **Object-Oriented Programming (OOP):**
    • Class input stores mood data (date, time, and message).
   
    • ArrayList is used to store multiple entries dynamically.

3. **User Interaction (Menu Driven):**
    • Options: Add entry, view entries, save to file, and exit.

4. **Data Persistence:**
    • Uses FileWriter to save all entries to a .txt file.

5. **Date-Time Handling:**
    • Uses LocalDateTime and DateTimeFormatter for timestamps.

## Analysis
• **Text-Based Interaction:** MoodLogger operates entirely through a command-line interface, ensuring minimal system requirements and ease of use without relying on any graphical components.
• **OOP Structure:** Uses Java’s object-oriented features to structure mood entries cleanly, improving code readability and reusability.
• **Dynamic Storage:** ArrayList is used to store entries during the session, allowing flexible handling of any number of logs.
• **Persistent Logging:** Mood data can be saved to a file using FileWriter, enabling users to keep records beyond the current session.
• **Lightweight & Portable:** As it doesn’t rely on external libraries or GUI frameworks, the application is highly portable and suitable for quick deployment or terminal-based environments.

## Result
The MoodLogger application successfully allowed users to log, view, and save their daily mood entries through a simple, menu-driven command-line interface. Each entry was accurately time-stamped using Java’s Date-Time API and stored dynamically in memory using an ArrayList. Users could persist their entries by saving them to a text file, ensuring long-term access to their mood history. The application performed reliably without a graphical interface, demonstrating efficient handling of user input, file operations, and data organization. Overall, the project effectively showcased key Java concepts such as object-oriented programming, file I/O, and runtime data management.

## Conclusion
MoodLogger is a simple yet effective Java application that demonstrates fundamental programming concepts like classes, file handling, and user input. Beyond being a coding exercise, it also offers a meaningful tool for emotional self-awareness. It can be enhanced in the future with graphical UI, database support, or even mood prediction using AI.
