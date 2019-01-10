## Builder

Builder. Used to create complex objects.

    Product (House): A class that represents the product to create.
    Builder (HouseBuilder): Is an interface to build the parts of a product.
    ConcreteBuilder(ConcreteHouseBuilder and PrefabricatedHouseBuilder): Are concrete classes that implement Builder to construct and assemble parts of the product and return the finished product.
    Director (ConstructionEngineer): A class that directs a builder to perform the steps in the order that is required to build the product.
