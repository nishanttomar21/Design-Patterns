// Eg: PubG Bullets
// Split Bullet class into intrinsic(remain same across all objects) and extrinsic(value of which might change across all objects) classes to reduce the space utilising
// The Flyweight design pattern is a structural pattern that optimizes memory usage by sharing common parts of state between multiple objects instead of keeping all the data in each object. It's particularly useful when dealing with a large number of similar objects.
// Intrinsic State: This is the state that can be shared among multiple objects. It is stored inside the Flyweight objects and is considered immutable(cannot change). Intrinsic state is independent of the context in which the object is used. For example, in a text editor, the intrinsic state of a character (Flyweight object) could include its font, size, and style.
// Extrinsic State: This is the state that is unique to each object and cannot be shared. It is passed to the Flyweight objects when they are used. Extrinsic state depends on the context and can vary between different uses of the Flyweight object. For example, in the text editor example, the position of each character would be extrinsic state.
// Benefits: Reduced Memory Usage, Improved Performance, Efficient Object Sharing
// Use Registry design patter to save the intrinsicState object as the value of HashMap and select key yourself

package Flyweight;

public class client {
}
