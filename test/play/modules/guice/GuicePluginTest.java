package play.modules.guice;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;

public class GuicePluginTest {
  @Test
  public void getBeanOfType_returnsNull_ifInjectorIsNull() {
    GuicePlugin plugin = new GuicePlugin();
    plugin.injector = null;

    assertNull(plugin.getBeanOfType(String.class));
  }
}