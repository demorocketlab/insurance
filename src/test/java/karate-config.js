function fn() {
  var env = karate.env; // get system property 'karate.env'
  karate.log('karate.env system property was:', env);
  if (!env) {
    env = 'dev';
  }
  var config = {
    env: env,
    baseURL: 'https://google.com/'
  }
  if (env == 'dev') {
    // customize
    // e.g. config.foo = 'bar';
  } else if (env == 'e2e') {
    // customize
  }
  karate.configure('driver', {
    type: 'playwright',
    playwrightOptions: {
      context: {
        viewport: null,
        launchOptions: {
          args: ['--start-maximized']
        }
      }
    }
  });
  return config;
}