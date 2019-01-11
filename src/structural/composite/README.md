# Composite Pattern

Composite. Takes a group of objects into a single object.


    Component (CatalogComponent): An abstract base class for the objects in the tree structure. This class defines the default behavior for all objects and behaviors to access and manage child components in the tree.
    Leaf(Product): Is a class that extends Component to represent leaves in the tree structure that does not have any children.
    Composite (ProductCatalog): Is a class that extends Component to represent nodes (contain children) in the tree structure. This class stores Leaf components and implements the behaviors defined in Component to access and manage child components. As mentioned earlier, child components can be one or more Leaf or other Composite components.
    Client: Interacts with Component to access and manipulate objects in the composition.



![alt text](https://springframework.guru/wp-content/uploads/2015/07/HierarchialTreeStructure.png)


![alt text](https://springframework.guru/wp-content/uploads/2015/07/ClassDiagram-1024x507.png)

