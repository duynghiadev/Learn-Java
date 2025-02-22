
export function randomNumberRange(min: number, max: number) {
    min = Math.ceil(min)
    max = Math.floor(max)
    return Math.floor(Math.random() * (max - min + 1)) + min
}

export function generateRandomString(length: number) {
    // Tạo chuỗi cơ bản gồm các chữ thường và số
    const baseString = "abcdefghijklmnopqrstuvwxyz0123456789";

    // Lấy ký tự đầu tiên là chữ
    let randomString = baseString[Math.floor(Math.random() * 26)];

    // Tạo các ký tự còn lại
    for (let i = 1; i < length; i++) {
        // Lấy số ngẫu nhiên từ 0 đến độ dài chuỗi cơ bản
        const randomIndex = Math.floor(Math.random() * baseString.length);

        // Thêm ký tự tương ứng vào chuỗi ngẫu nhiên
        randomString += baseString[randomIndex];
    }
    // Trả về chuỗi ngẫu nhiên
    return randomString;
}