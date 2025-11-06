 Sorting Algorithm Comparison Tool

![Java](https://img.shields.io/badge/Java-17-blue)
![License](https://img.shields.io/badge/License-MIT-green)
![Version](https://img.shields.io/badge/Version-1.0.0-orange)

A comprehensive Java console application that implements and compares the performance of three fundamental sorting algorithms: **Bubble Sort**, **Merge Sort**, and **Quick Sort**. This tool provides detailed insights into algorithmic complexity through real-time performance metrics and step counting.

 📋 Table of Contents

- [Features](#features)
- [Algorithms Implemented](#algorithms-implemented)
- [Installation](#installation)
- [Usage](#usage)
- [Team Members](#team-members)
- [Project Structure](#project-structure)
- [Performance Metrics](#performance-metrics)
- [Examples](#examples)
- [Technical Details](#technical-details)
- [Contributing](#contributing)
- [License](#license)

✨ Features

- 🔄 Multiple Sorting Algorithms**: Bubble Sort, Merge Sort, and Quick Sort
- 📊 Performance Comparison**: Real-time execution time and step count analysis
- 🎯 User-Friendly Interface**: Intuitive console-based menu system
- 📈 Data Generation**: Manual input or automatic random dataset generation
- ⚡ Step Counting**: Detailed operation tracking for each algorithm
- 📋 Results Table**: Comprehensive performance summary display
- 🔒 Input Validation**: Robust error handling and data validation

 🧮 Algorithms Implemented

| Algorithm | Time Complexity | Space Complexity | Team Member |
|-----------|----------------|------------------|-------------|
| Bubble Sort | O(n²) | O(1) | 22UG3-0229 Y.A.D.Hasith Roosara |
| Merge Sort | O(n log n) | O(n) | 22UG3-0203 Randika Lakshan |
| Quick Sort | O(n log n) | O(log n) | 22UG3-0557 Pawan Methsara |
| UI & Integration | - | - | 22UG3-0873 H.G.Punara Punsisi |

 🚀 Installation

 Prerequisites

- Java JDK 17 or higher
- Git for version control

Clone the Repository

```bash
git clone https://github.com/your-username/SortingAlgorithmComparison.git
cd SortingAlgorithmComparison
```

 Compile the Project

```bash
# Compile all Java files
javac src/*.java -d out/
```

 Run the Application

```bash
# Run from the compiled classes
java -cp out Main
```

 🎮 Usage

Main Menu Options

```
--- Data Sorter: Sorting Algorithm Comparison Tool ---
1. Enter numbers manually
2. Generate random numbers
3. Perform Bubble Sort
4. Perform Merge Sort
5. Perform Quick Sort
6. Compare all algorithms (show performance table)
7. Exit
```

 Step-by-Step Guide

1. Start the application:
   ```bash
   java -cp out Main
   ```

2. Input Data:
   - Choose option 1 to enter numbers manually
   - Choose option 2 to generate random numbers
   - Specify the dataset size and values

3. Run Individual Algorithms:
   - Options 3-5: Execute specific sorting algorithms
   - View sorted results and individual performance metrics

4. Compare All Algorithms:
   - Option 6: Comprehensive performance comparison
   - Displays execution time and step counts in a formatted table

5. Exit: Option 7 to quit the application

 👥 Team Members

| Role | Team Member | Responsibilities |
|------|-------------|------------------|
| Bubble Sort Expert | [@Roosara999](https://github.com/Rossara999) | Bubble Sort implementation with step counting |
| Merge Sort Specialist | [@Ranuwaz](https://github.com/Ranuwaz) | Merge Sort with performance measurement |
| Quick Sort Developer | [@22ug3-0557](https://github.com/22ug3-0557) | Quick Sort with performance integration |
| UI/Integration Lead | [@Pgamara](https://github.com/Pgamara) | Data management, performance comparison, and user interface |

 📁 Project Structure

```
SortingAlgorithmComparison/
├── src/
│   ├── Main.java                 # Main application entry point
│   ├── BubbleSort.java          # Bubble Sort implementation
│   ├── MergeSort.java           # Merge Sort implementation
│   ├── QuickSort.java           # Quick Sort implementation
│   ├── DataManager.java         # Data input and generation
│   └── PerformanceComparator.java # Performance analysis
├── out/                         # Compiled class files
├── README.md                    # Project documentation

```

 📊 Performance Metrics

The application tracks two key performance indicators:

1. Execution Time: Measured in nanoseconds using `System.nanoTime()`
2. Step Count: Number of operations performed by each algorithm

 Example Performance Output

```
=== PERFORMANCE COMPARISON ===
+-----------------+------------------+-----------------+
| Algorithm       | Time (nanoseconds) | Steps         |
+-----------------+------------------+-----------------+
| Bubble Sort     |         12456789 |          24560 |
| Merge Sort      |           456789 |           8923 |
| Quick Sort      |           234567 |           5678 |
+-----------------+------------------+-----------------+
```

 💡 Examples

 Example 1: Small Dataset

Input: `[5, 2, 8, 1, 9]`

Expected Results:
- **Bubble Sort**: Higher steps, slower for small data
- **Merge Sort**: Consistent performance
- **Quick Sort**: Fastest for random data

Example 2: Large Dataset (1000 elements)

Observations:
- **Bubble Sort**: Significantly slower (O(n²) complexity)
- **Merge Sort**: Stable performance (O(n log n))
- **Quick Sort**: Generally fastest (O(n log n) average case)

🔧 Technical Details

 Bubble Sort Implementation
- **Approach**: Repeatedly steps through the list, compares adjacent elements
- **Step Counting**: Tracks comparisons and swaps
- **Best Case**: O(n) when array is sorted
- **Worst Case**: O(n²) when array is reverse sorted

 Merge Sort Implementation
- **Approach**: Divide and conquer algorithm
- **Step Counting**: Tracks divisions, merges, and comparisons
- **Performance**: Consistent O(n log n) in all cases

 Quick Sort Implementation
- **Approach**: Partitioning around a pivot element
- **Step Counting**: Tracks comparisons and swaps
- **Performance**: O(n log n) average case, O(n²) worst case

 Data Management
- **Input Validation**: Ensures proper integer input
- **Data Generation**: Configurable random number generation
- **Array Cloning**: Prevents mutation of original data during sorting

 🤝 Contributing
 Development Workflow

1. **Fork the repository**
2. **Create a feature branch**:
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Commit your changes**:
   ```bash
   git commit -m "Add your feature description"
   ```
4. **Push to the branch**:
   ```bash
   git push origin feature/your-feature-name
   ```
5. **Create a Pull Request**

 Branch Naming Convention

- `feature/bubble-sort-enhancement`
- `bugfix/performance-timing`
- `docs/readme-update`

 📝 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

 🎓 Academic Context

**Course**: CIT300 - Data Structures and Algorithms  
**Institution**: SLTC Research University  
**Assignment**: Practical Assignment 2 - Sorting Algorithm Comparison  


🔮 Future Enhancements

- [ ] Graphical User Interface (GUI)
- [ ] Additional sorting algorithms (Heap Sort, Radix Sort)
- [ ] Export performance data to CSV
- [ ] Real-time performance charts
- [ ] Memory usage tracking
- [ ] Multi-threading support for larger datasets

 📞 Support

For questions or issues regarding this project:

1. Check the [Issues](https://github.com/Pgamara/SortingAlgorithmComparison/issues) page
2. Create a new issue with detailed description
3. Contact team members via their GitHub profiles

 🙏 Acknowledgments

- Team collaboration tools: GitHub, IntelliJ IDEA, and VS Code

---

⭐ If you find this project useful, please give it a star on GitHub!


