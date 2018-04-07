Client class has no references to factory and product implementations.
It has direct reference to  platform **Factory** interface and product families **ProductA** and **ProductB** interfaces.
To fully decouple client from implementations **FactoryLocator** class is introduced, based on the context
it choose particular factory to show.


## Context

Even if here a simple integer context is used in real application context will be a more complex data structure
based on user input/selection, system configuration or application configuration, as well as complex algorithm input
like recomendation engine.


## Flexibility
There two dimensions:
- Platform variations - can be introduced by adding more platform **Factory** interfaces
- Product families variations - can be introduced by adding more product families **Product** interfaces


See other concrete example inwikipedia: https://en.wikipedia.org/wiki/Abstract_factory_pattern