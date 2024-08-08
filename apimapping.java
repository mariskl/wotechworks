@GetMapping("/ping")
	public String ping() {

		return "pong";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name); // "Hello " + name + "!";
	}

	@GetMapping("/getbook")//localhost:8080/getbook
	public Book getBook(){
		var book = new Book();
		book.title = "book title";
		book.author = "book author";

		return book;
	}

	@PostMapping("/addbook")
	public Book addBook(@RequestBody Book book){
		book.title = book.title.toUpperCase();
		return book;
	}
	@PostMapping("/authorize")
	public User authorize(@RequestBody Credentials credentials){ // username + password
		if(credentials.username.equals("maris") && credentials.password.equals("maris123")){
			var user = new User();
			user.name = "Maris";
			return user;
		}
		return null;
	}
	@PostMapping("/choosecheese")
	public Cheese chooseCheese(@RequestBody Cheese choosecheese){
		if(choosecheese.type.equals("soft") && choosecheese.name.equals("cheese")){
			var cheese = new Cheese();
			cheese.type = "soft and moldy";
			cheese.name = "brie";

			return cheese;
		}
       return null;
    }
