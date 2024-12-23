

<p>Este proyecto es un ejemplo de un sistema de gestión de facturas desarrollado en Java utilizando Spring Framework. El código aborda varios conceptos importantes de Spring y Java, que se detallan a continuación.</p>


<h2>Temas destacados</h2>

<ul>
  <li>
    <strong>RequestScope:</strong>
    <p>La clase <code>Factura</code> está marcada con <code>@RequestScope</code>, lo que significa que se crea una nueva instancia de la factura para cada solicitud HTTP. Esto es útil para manejar datos específicos de una solicitud temporal.</p>
  </li>
  <li>
    <strong>@Value:</strong>
    <p>Se utiliza la anotación <code>@Value</code> para inyectar valores desde el archivo de propiedades <code>data.properties</code>. Por ejemplo, el campo <code>descripcion</code> de la factura se inicializa con el valor <code>factura.descripcion</code> definido en el archivo.</p>
  </li>
  <li>
    <strong>PostConstruct y PreDestroy:</strong>
    <p>Se utilizan las anotaciones <code>@PostConstruct</code> y <code>@PreDestroy</code> en la clase <code>Factura</code> para realizar acciones específicas:</p>
    <ul>
      <li><code>@PostConstruct:</code> Configura valores iniciales después de que el bean sea creado.</li>
      <li><code>@PreDestroy:</code> Limpia recursos antes de que el bean sea destruido.</li>
    </ul>
  </li>
  <li>
    <strong>Beans y Scope:</strong>
    <p>Se crean beans con diferentes configuraciones utilizando la anotación <code>@Bean</code> en la clase <code>AppConfiguracion</code>. Se utiliza <code>@Primary</code> para establecer un bean predeterminado cuando hay varios del mismo tipo.</p>
  </li>
  <li>
    <strong>Listas inyectadas:</strong>
    <p>En la clase <code>Factura</code>, se inyecta una lista de <code>Item</code> que contiene objetos representativos de productos y sus cantidades.</p>
  </li>
  <li>
    <strong>Propiedades externas:</strong>
    <p>El archivo <code>data.properties</code> contiene configuraciones externas para el cliente y la factura, facilitando la gestión de configuraciones sin modificar el código fuente.</p>
  </li>
  <li>
    <strong>Streams y Lambda Expressions:</strong>
    <p>El método <code>getTotal</code> en la clase <code>Factura</code> utiliza <code>streams</code> y expresiones lambda para calcular el total de la factura de manera eficiente.</p>
  </li>
</ul>

<h2>Estructura del proyecto</h2>

<ul>
  <li><strong>Factura:</strong> Clase principal que representa una factura, incluyendo cliente, descripción y lista de ítems.</li>
  <li><strong>Item:</strong> Clase que representa un ítem de la factura, compuesto por un producto y su cantidad.</li>
  <li><strong>Producto:</strong> Clase que representa un producto con nombre y precio unitario.</li>
  <li><strong>AppConfiguracion:</strong> Clase de configuración donde se definen los beans y se cargan propiedades externas.</li>
</ul>

<h2>Archivos importantes</h2>

<ul>
  <li><strong>data.properties:</strong> Archivo de propiedades que contiene configuraciones externas para cliente y factura.</li>
</ul>


<h2>Requisitos</h2>
<ul>
  <li>Java 8 o superior</li>
  <li>Spring Framework</li>
  <li>IDE como IntelliJ IDEA o Eclipse</li>
</ul>
