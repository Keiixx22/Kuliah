let product;
let buyer;


class Product {
    #nama;
    #harga;
    #stock;

    constructor(nama, harga, stock) {
        this.#nama = nama;

        if (harga < 0) {
            console.log("harga tidak boleh negatif, diset ke 0")
            this.#harga = 0;
        } else {
            this.#harga = harga;
        }

        if (stock < 0) {
            console.log("Stock tidak bisa negatif, diset ke 0")
            this.#stock = 0;
        } else {
            this.#stock = stock
        }
    }

    get nama() {
        return this.#nama;
    }

    get harga() {
        return this.#harga;
    }

    get stock() {
        return this.#stock
    }

    _reduceStock(qty) {
        this.#stock -= qty;
    }
}

class Customer {
    #id
    #nama
    #saldo

    constructor(id, nama, saldo) {
        this.#id = id;
        this.#nama = nama;

        if (saldo < 0) {
            console.log("Saldo anda tidak bisa negatif, diset ke 0")
            this.#saldo = 0;
        } else {
            this.#saldo = saldo;
        }
    }

    get id() {
        return this.#id
    }

    get nama() {
        return this.#nama
    }

    get saldo() {
        return this.#saldo
    }

    buyProduct(product, qty) {        
        if (!Number.isInteger(qty) || qty <= 0) {
            return {ok: false, pesan: "Jumlah harus lebih dari 0"};
        }
        if (product.stock < qty) {
            return {ok: false, pesan: "Stock Kurang"}
        }
        const total = product.harga * qty
        if (this.#saldo < total) {
            return {ok:false, pesan: "Saldo anda kurang"}
        } else {
            this.#saldo -= total;
            product._reduceStock(qty);
            return {ok: true, pesan: "Transaksi berhasil"};
        }
    }
}

function resetData() {
    product = new Product("Iphone 18 promek", 20000000, 10)
    buyer = new Customer(1, "Pandu", 50000000)
}

function formatRupiah(angka) {
    return new Intl.NumberFormat("id-ID", {style: "currency", currency: "IDR", maximumFractionDigits: 0}).format(angka)
}

function render() {
    document.getElementById("produk-nama").textContent = product.nama;
    document.getElementById("produk-harga").textContent = formatRupiah(product.harga);
    document.getElementById("produk-stok").textContent = product.stock;
    document.getElementById("pembeli-nama").textContent = buyer.nama;
    document.getElementById("pembeli-id").textContent = buyer.id;
    document.getElementById("pembeli-saldo").textContent = formatRupiah(buyer.saldo);
}

function tampilkanPesan(hasil) {
    const el = document.getElementById("pesan");
    el.textContent = hasil.pesan;
    
    if (hasil.ok) {
        el.className = "rounded-lg p-4 bg-green-100 text-green-800";
    } else {
        el.className = "rounded-lg p-4 bg-red-100 text-red-800";
    }
}

function jalankanSkenario(qty) {
    resetData();
    const hasil = buyer.buyProduct(product, qty)
    tampilkanPesan(hasil)
    render()
}

resetData();
render();

document.getElementById("btn-beli").addEventListener("click", function() {
    const qty = Number(document.getElementById("input-qty").value);
    const hasil = buyer.buyProduct(product, qty)
    tampilkanPesan(hasil)
    render();
})

document.getElementById("btn-skenario-1").addEventListener("click", function() {jalankanSkenario(2)})
document.getElementById("btn-skenario-2").addEventListener("click", function() {jalankanSkenario(20)})
document.getElementById("btn-skenario-3").addEventListener("click", function() {jalankanSkenario(3)})
